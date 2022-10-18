package com.khaki.shoppinglist.android.screen.task_list.view

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import java.util.Date

data class GoodsListUiState(
    val isLoading: Boolean = false,
    val goods: List<GoodsItemUiState> = listOf(),
)

data class GoodsItemUiState(
    val id: Long = 0,
    val title: String = "",
    val isCheck: Boolean = false,
    val createdAt: Date = Date(),
    val categoryId: Long = 0,
)

class PreviewGoodsItemUiStateProvider: PreviewParameterProvider<GoodsItemUiState> {
    override val values: Sequence<GoodsItemUiState>
        get() = sequenceOf(
            GoodsItemUiState(
                id = 0,
                title = "サランラップ",
                isCheck = false,
                createdAt = Date(),
                categoryId = 0,
            ),
            GoodsItemUiState(
                id = 0,
                title = "ごま油",
                isCheck = true,
                createdAt = Date(),
                categoryId = 0,
            ),
            GoodsItemUiState(
                id = 0,
                title = "カレー粉",
                isCheck = false,
                createdAt = Date(),
                categoryId = 0,
            ),
        )

}