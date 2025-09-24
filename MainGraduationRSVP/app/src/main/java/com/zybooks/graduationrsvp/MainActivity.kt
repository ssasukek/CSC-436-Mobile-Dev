package com.zybooks.graduationrsvp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zybooks.graduationrsvp.ui.theme.GraduationRSVPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GraduationRSVPTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GradScreen()
                }
            }
        }
    }
}
   
@Composable
fun GradScreen(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.grad_cap),
        contentDescription = "Graduation cap",
        alpha = 0.3f,
        modifier = modifier.size(200.dp)
    )
    Text(
        text = stringResource(R.string.graduation_announcement),
        fontSize = 50.sp,
        lineHeight = 50.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Red,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
    Icon(
        imageVector = Icons.Filled.Info,
        contentDescription = "Event Icon",
        tint = Color.Gray,
        modifier = modifier.size(100.dp)

    )
    Text(
        text = "May 14 - Ganus Hall - 2:00 pm",
        fontSize = 15.sp,
        color = Color.Gray,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
//    Switch(
//        checked =
//    )
//    Text(
//        text = if (checked) "I'll be there!" else "Sorry I can't be there.",
//        fontSize = 20.sp
//    )
}

@Preview(showBackground = true)
@Composable
fun GradPreview() {
    GraduationRSVPTheme {
        GradScreen()
    }
}