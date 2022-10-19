package com.khaki.shoppinglist.android.screen.task_list.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter

@Composable
fun GoodsListScreen(

) {
}

@Composable
fun GoodsListContent(
    uiState: GoodsListUiState,
    onClickBackButton: () -> Unit = {},
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(text = "買う物一覧")
                },
                navigationIcon = {
                    IconButton(onClick = onClickBackButton) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                        )
                    }
                }
            )
        }
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            contentAlignment = Alignment.Center
        ) {

            when {
                uiState.isLoading -> {
                    CircularProgressIndicator()
                }
                uiState.goods.isNotEmpty() -> {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize(),
                    ) {
                        items(
                            items = uiState.goods,
                        ) { item ->
                            GoodsItem(uiState = item)
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewGoodsListContent_Loading(
    @PreviewParameter(PreviewGoodsListStateProvider::class) item: GoodsListUiState
) {
    GoodsListContent(
        uiState = item
    )
}