fun main() {
    var id: Long = 0

    // заполняем массив
    for (i in 0..5) {
        WallService.add(Post(++id))
    }
    WallService.update(Post(5))

    var attachments1 = emptyArray<Attachment>()
    var attachments2 = emptyArray<Attachment>()

    attachments1 += VideoAttachment(Video(3452))
    attachments1 += PhotoAttachment(Photo())
    attachments1 += MapAttachment(Map())

    attachments2 += FileAttachment(File(23488))
    attachments2 += AudioAttachment(Audio())

    val somePost1 = WallService.add(Post(++id, attachments1))
    val somePost2 = WallService.add(Post(++id, attachments2))

    WallService.printPosts()
}