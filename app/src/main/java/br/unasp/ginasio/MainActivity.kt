package br.unasp.ginasio

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.unasp.ginasio.ui.theme.GinasioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            GreetingPreview()
            GinasioUm("teste", "ginasio")
        }
    }
}


@Composable
fun GinasioUm(nome: String, funcao: String,
              modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize().padding(top = 15.dp),
        verticalArrangement = Arrangement.SpaceBetween) {
        Row(
            modifier = modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box( // o círculo com a inicial
                Modifier.size(48.dp).clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFF103A5E)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "A",
                    color = Color.White
                )
            }
            Spacer(Modifier.width(12.dp))
            Column(Modifier.weight(1f)) {
                Text(nome, fontWeight = FontWeight.Bold)
                Text(funcao, fontSize = 12.sp)
            }
            Text("20:53", color = Color.Magenta)
        }

        Column(modifier = Modifier.padding(20.dp)) {
            Box( // o círculo com a inicial
                Modifier.fillMaxWidth().height(150.dp).clip(RoundedCornerShape(10.dp))
                    .background(Color.LightGray)
            ) {}
            Text("Fone Bluetooth X200", modifier.padding(10.dp), fontWeight = FontWeight.Bold)
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text("R$249,90")
                Button(onClick = {}) {
                    Text("Comprar")
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth().padding(20.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("Total")
            Text("R$ 42,90")
        }
    }
}