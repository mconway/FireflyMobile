package xyz.hisname.fireflyiii.repository.models.bills

data class Pagination(
    val total: Int,
    val count: Int,
    val per_page: Int,
    val current_page: Int,
    val total_pages: Int
)