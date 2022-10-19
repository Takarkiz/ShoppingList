package com.khaki.shoppinglist.android.screen.task_list.view

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import java.util.*

data class GoodsListUiState(
    val isLoading: Boolean = false,
    val goods: List<GoodsItemUiState> = listOf(),
)

class PreviewGoodsListStateProvider : PreviewParameterProvider<GoodsListUiState> {
    override val values: Sequence<GoodsListUiState>
        get() = sequenceOf(
            GoodsListUiState(
                isLoading = true,
                goods = listOf(),
            ),
            GoodsListUiState(
                isLoading = false,
                goods = PreviewGoodsItemUiStateProvider().values.toList()
            )
        )
}

data class GoodsItemUiState(
    val id: Long = 0,
    val title: String = "",
    val isCheck: Boolean = false,
    val createdAt: Date = Date(),
    val categoryId: Long = 0,
)

class PreviewGoodsItemUiStateProvider : PreviewParameterProvider<GoodsItemUiState> {
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