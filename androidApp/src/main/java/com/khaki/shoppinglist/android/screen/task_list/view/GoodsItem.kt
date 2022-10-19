package com.khaki.shoppinglist.android.screen.task_list.view

import android.text.format.DateFormat
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp

@Composable
fun GoodsItem(
    uiState: GoodsItemUiState,
    onClickCheckbox: (Boolean) -> Unit = {},
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClickCheckbox(uiState.isCheck.not())
            }
            .background(
                color = MaterialTheme.colors.background
            )
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Checkbox(
            checked = uiState.isCheck,
            onCheckedChange = onClickCheckbox,
        )

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = uiState.title,
                style = MaterialTheme.typography.subtitle1
            )

            val createdAt = DateFormat.format("yyyy/M/d HH:ss", uiState.createdAt).toString()
            Text(
                text = createdAt,
                style = MaterialTheme.typography.subtitle2
            )
        }
    }
}

@Preview
@Composable
fun PreviewGoodsItem(
    @PreviewParameter(PreviewGoodsItemUiStateProvider::class) uiState: GoodsItemUiState
) {
    GoodsItem(
        uiState = uiState
    )
}