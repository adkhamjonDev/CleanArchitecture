package uz.adkhamjondev.domain.common

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

open class ErrorHandler {
    protected suspend fun <T, K> loadResult(
        requestSource: suspend () -> Response<T>,
        successBody: suspend (T, FlowCollector<Resource<K>>) -> Unit
    ): Flow<Resource<K>> = withContext(Dispatchers.IO) {
        flow {
            try {
                emit(Resource.Loading())
                val data = requestSource.invoke()
                if (data.isSuccessful) {
                    val result = data.body()
                    if (result != null) {
                        successBody.invoke(result, this)
                    } else {
                        emit(
                            Resource.Error(
                                "An expected error occurred!"
                            )
                        )
                    }
                } else {
                    emit(
                        Resource.Error(
                            "An expected error occurred!"
                        )
                    )
                }
            }
            catch (e: HttpException) {
                emit(
                    Resource.Error(
                        "An expected error occurred!"
                    )
                )
            }
            catch (e: IOException) {
                emit(
                    Resource.Error(
                        "Couldn't reach server. Please check your internet connection!"
                    )
                )
            }
        }
    }
}