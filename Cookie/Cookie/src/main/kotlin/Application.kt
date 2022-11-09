import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking

fun do_my_fucking_magic(url: String) = runBlocking {
    val client = HttpClient(CIO)
    val resp = client.get(url)

    client.close()

    return@runBlocking resp.headers
}

fun main(args: Array<String>) {
    ///  код который считает инпут в переменную url
    val url = "http://ya.ru"
    val headers = do_my_fucking_magic(url)

    println(headers.get("Set-Cookie"))
}