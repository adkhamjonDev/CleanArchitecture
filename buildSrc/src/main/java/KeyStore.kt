import java.io.File
import java.io.FileInputStream
import java.util.*

object KeyStore {
    const val KEY_STORE_FILE = "key/app_key.jks"
    const val KEY_STORE_PASS = "1234"
    const val KEY_ALIAS = "1234"
    const val KEY_PASS = "1234"

    private val properties by lazy {
        Properties().apply { load(FileInputStream(File("key.properties"))) }
    }

    fun getValue(key: String): String {
        return properties.getProperty(key)
    }
}