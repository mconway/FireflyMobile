package xyz.hisname.fireflyiii.repository.models.bills

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity
data class BillAttributes(
        @PrimaryKey(autoGenerate = true)
        val billIdPlaceHolder: Long,
        val updated_at: String,
        val created_at: String,
        var name: String,
        val currency_id: Int,
        val currency_code: String,
        val amount_min: BigDecimal,
        val amount_max: BigDecimal,
        val date: String,
        val repeat_freq: String,
        val skip: Int = 0,
        val automatch: Boolean,
        val active: Boolean,
        val attachments_count: Int,
        val pay_dates: List<String>,
        val paid_dates: List<String>,
        val markdown: String?
)