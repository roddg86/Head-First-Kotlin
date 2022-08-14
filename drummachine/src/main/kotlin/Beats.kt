import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

/* Параметр beats задает ритм воспроизведения, а параметр file - воспроизводимый звуковой файл. */
fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            /* playSound вызывается по одному разу для каждого символа х в параметре beats */
            playSound(file)
        } else {
            /* Приостанавливает текущий поток выполнения, чтобы дать время для вопроизведения звукового файла */
            Thread.sleep(100 * (part.length + 1L))
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

fun main() {
    runBlocking {
        /* Воспроизводятся указанные звуковые файлы */
        launch { playBeats("x-x-x-x-x-x-", "toms.aiff") }
        playBeats("x-----x-----", "crash_cymbal.aiff")
    }

}