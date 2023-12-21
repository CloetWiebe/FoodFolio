package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme

@Composable
fun DonutChartThreeColors(strokeThickness: Dp, modifier: Modifier = Modifier) {
    val text = "600 kcal"
    val textSize = 16
    val colorOnPrimaryContainer = MaterialTheme.colorScheme.onPrimaryContainer
    val greenColor = Color(0xFF05E35E)
    val redColor = Color(0xFFEB4034)
    val blueColor = Color(0xFF34C0EB)

    Canvas(
        modifier = modifier
            .padding(4.dp),

        onDraw = {
            val outerRadius = size.width / 2
            val centerX = size.width / 2
            val centerY = size.height / 2

            // Draw the outer border with three segments
            drawArc(
                color = greenColor,
                startAngle = -60f, // Start at -60 degrees
                sweepAngle = 120f,
                useCenter = false,
                size = size,
                topLeft = Offset(centerX - outerRadius, centerY - outerRadius),
                style = Stroke(strokeThickness.toPx())
            )

            drawArc(
                color = redColor,
                startAngle = 60f, // Start at 60 degrees
                sweepAngle = 120f,
                useCenter = false,
                size = size,
                topLeft = Offset(centerX - outerRadius, centerY - outerRadius),
                style = Stroke(strokeThickness.toPx())
            )

            drawArc(
                color = blueColor,
                startAngle = 180f, // Start at 180 degrees
                sweepAngle = 120f,
                useCenter = false,
                size = size,
                topLeft = Offset(centerX - outerRadius, centerY - outerRadius),
                style = Stroke(strokeThickness.toPx())
            )

            drawIntoCanvas { canvas ->
                // Add two lines of text vertically centered
                val paint = Paint().asFrameworkPaint()
                paint.textSize = textSize.dp.toPx() // Set the text size (adjust the value as needed)

                // Set the text color based on the theme
                paint.color = colorOnPrimaryContainer.toArgb()

                val lineHeight = paint.fontSpacing

                // Split the text into two words
                val words = text.split(" ")

                // Calculate the width of each line of text
                val firstWordWidth = paint.measureText(words.first())
                val secondWordWidth = paint.measureText(words.last())

                // Calculate the x position for each line to keep them centered
                val xFirstWord = centerX - firstWordWidth / 2
                val xSecondWord = centerX - secondWordWidth / 2

                // Draw the first word
                canvas.nativeCanvas.drawText(
                    words.first(),
                    xFirstWord,
                    centerY - lineHeight / 2,
                    paint
                )

                // Draw the second word below the first
                canvas.nativeCanvas.drawText(
                    words.last(),
                    xSecondWord,
                    centerY + lineHeight / 2,
                    paint
                )
            }
        }
    )
}

@Composable
fun DonutChartTwoColors(strokeThickness: Dp, modifier: Modifier = Modifier) {
    val text = "1500 kcal"
    val textSize = 16
    val colorOnPrimaryContainer = MaterialTheme.colorScheme.onPrimaryContainer
    Canvas(
        modifier = modifier
            .padding(4.dp),

        onDraw = {
            val outerRadius = size.width / 2
            val centerX = size.width / 2
            val centerY = size.height / 2

            // Draw the outer border with three segments
            drawArc(
                color = Color.LightGray,
                startAngle = -90f, // Start at -90 degrees
                sweepAngle = 60f,  // Draw a 60-degree arc
                useCenter = false,
                size = size,
                topLeft = Offset(centerX - outerRadius, centerY - outerRadius),
                style = Stroke(strokeThickness.toPx())
            )

            drawArc(
                color = Color.Black,
                startAngle = -30f, // Start at -30 degrees (90 - 60)
                sweepAngle = 300f, // Draw a 240-degree arc (360 - 60)
                useCenter = false,
                size = size,
                topLeft = Offset(centerX - outerRadius, centerY - outerRadius),
                style = Stroke(strokeThickness.toPx())
            )

            drawIntoCanvas { canvas ->
                // Add two lines of text vertically centered
                val paint = Paint().asFrameworkPaint()
                paint.textSize = textSize.dp.toPx() // Set the text size (adjust the value as needed)
                paint.color = colorOnPrimaryContainer.toArgb()
                val lineHeight = paint.fontSpacing

                // Split the text into two words
                val words = text.split(" ")

                // Calculate the width of each line of text
                val firstWordWidth = paint.measureText(words.first())
                val secondWordWidth = paint.measureText(words.last())

                // Calculate the x position for each line to keep them centered
                val xFirstWord = centerX - firstWordWidth / 2
                val xSecondWord = centerX - secondWordWidth / 2

                // Draw the first word
                canvas.nativeCanvas.drawText(
                    words.first(),
                    xFirstWord,
                    centerY - lineHeight / 2,
                    paint
                )

                // Draw the second word below the first
                canvas.nativeCanvas.drawText(
                    words.last(),
                    xSecondWord,
                    centerY + lineHeight / 2,
                    paint
                )
            }
        }
    )
}

@Composable
fun CalorieGraphs() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            DonutChartThreeColors(strokeThickness = 8.dp, modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
            )
            Text("Consumed", modifier = Modifier.align(Alignment.CenterHorizontally), color = MaterialTheme.colorScheme.onPrimaryContainer, style = MaterialTheme.typography.bodyLarge)
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            DonutChartTwoColors(strokeThickness = 8.dp, modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
            )
            Text("Remaining", modifier = Modifier.align(Alignment.CenterHorizontally), color = MaterialTheme.colorScheme.onPrimaryContainer, style = MaterialTheme.typography.bodyLarge)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DonutChartsRowWithTextPreviewLight() {
    AppTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ){
            CalorieGraphs()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DonutChartsRowWithTextPreviewDark() {
    AppTheme(useDarkTheme = true) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ){
            CalorieGraphs()
        }
    }
}