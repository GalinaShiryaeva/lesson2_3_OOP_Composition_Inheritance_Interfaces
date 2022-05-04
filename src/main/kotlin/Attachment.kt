sealed class Attachment(val type: String)

data class VideoAttachment(val video: Video) : Attachment("video")
data class AudioAttachment(val audio: Audio) : Attachment("audio")
data class PhotoAttachment(val photo: Photo) : Attachment("photo")
data class FileAttachment(val file: File) : Attachment("file")
data class MapAttachment(val map: Map) : Attachment("map")

class Video(
    val id: Int,
    val album_id: Int = 12,
    val owner_id: Int = 12,
    val user_id: Int = 12
)

class Audio(
    val id: Int = 14,
    val album_id: Int = 14,
    val owner_id: Int = 14,
    val user_id: Int = 14
)

class File(
    val id: Int = 15,
    val album_id: Int = 15,
    val owner_id: Int = 15,
    val user_id: Int = 15
)

class Photo(
    val id: Int = 17,
    val album_id: Int = 17,
    val owner_id: Int = 17,
    val user_id: Int = 17
)

class Map(
    val id: Int = 18,
    val album_id: Int = 18,
    val owner_id: Int = 18,
    val user_id: Int = 18
)
