package io.konobank.core.model

import kotlinx.serialization.Serializable

/**
 * Перелік транзакцій за вказанний час
 */

@Serializable
data class StatementItem(
    val id: String,
    val time: Int,
    val description: String,
    val mcc: Int,
    val hold: Boolean,
    val amount: Long,
    val operationAmount: Long,
    val currencyCode: Int,
    val commissionRate: Long,
    val cashbackAmount: Long,
    val balance: Long
)