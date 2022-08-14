/* При выполнении этого кода барабан и тарелки, как и прежде, звучат параллельно. Но на этот раз звуковые файлы
воспроизводятся в разных сопрограммах в одном потоке. */
import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

/* suspend означает что сопрограмма может приостанавливатся */
suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            /* playSound вызывается по одному разу для каждого символа х в параметре beats */
            playSound(file)
        } else {
            /* Приостанавливает текущий поток выполнения, чтобы дать время для вопроизведения звукового файла */
            delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(
            file
        )
    )
    clip.open(audioInputStream)
    clip.start()
}
/* Пометьте функцию main префиксом suspend, чтобы она могла вызывать функцию playBeats. */
/* Барабан и тарелки по-прежнему звучат параллельно, но на этот раз мы используем более эффективный
способ воспроизведения звуковых файлов. */
suspend fun main() {
    /* Функция runBlocking блокирует текущий поток до завершения
    выполнения содержащегося в ней кода. */
    runBlocking {
        /* Воспроизводятся указанные звуковые файлы */
        launch { playBeats("x-x-x-x-x-x-", "toms.aiff") }
        playBeats("x-----x-----", "crash_cymbal.aiff")
    }

}