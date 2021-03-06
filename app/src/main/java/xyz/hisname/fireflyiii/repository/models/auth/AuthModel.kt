package xyz.hisname.fireflyiii.repository.models.auth

data class AuthModel(
        val token_type: String,
        val expires_in: Int,
        val access_token: String,
        val refresh_token: String
)