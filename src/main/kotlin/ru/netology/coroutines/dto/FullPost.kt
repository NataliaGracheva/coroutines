package ru.netology.coroutines.dto

data class FullPost(
    val id: Long,
    val author: Author,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
    val comments: List<FullComment>,
)

data class FullComment(
    val id: Long,
    val postId: Long,
    val author: Author,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)
