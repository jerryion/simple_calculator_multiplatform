package im.pumpkin.common

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    val vm = remember { CalculatorViewModel() }
    CalculatorTheme {
        Surface {
            Column {
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .weight(0.3f)
                        .fillMaxWidth()
                ) {
                    val expression by vm.expression.collectAsState("")
                    Text(
                        text = expression,
                        style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.align(Alignment.BottomEnd)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(0.7f)
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .weight(0.2f)
                            .fillMaxSize()
                    ) {
                        Button(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Clear)
                            }
                        ) {
                            Icon(imageVector = Icons.Default.Delete, contentDescription = "A clear icon")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.5f)
                                .fillMaxSize(),
                            onClick = {

                            }, enabled = false
                        ) {
                            Icon(imageVector = Icons.Default.Check, contentDescription = "A logo")
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Calculator")
                        }
                        Button(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Op(Operator.DIVIDE))
                            }
                        ) {
                            Text("÷")
                        }
                    }
                    Row(
                        modifier = Modifier
                            .weight(0.2f)
                            .fillMaxSize()
                    ) {
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(7))
                            }) {
                            Text("7")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(8))
                            }) {
                            Text("8")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(9))
                            }) {
                            Text("9")
                        }
                        Button(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Op(Operator.MULTIPLY))
                            }) {
                            Text("×")
                        }
                    }
                    Row(
                        modifier = Modifier
                            .weight(0.2f)
                            .fillMaxSize()
                    ) {
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(4))
                            }
                        ) {
                            Text("4")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(5))
                            }
                        ) {
                            Text("5")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(6))
                            }
                        ) {
                            Text("6")
                        }
                        Button(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Op(Operator.MINUS))
                            }
                        ) {
                            Text("-")
                        }
                    }
                    Row(
                        modifier = Modifier
                            .weight(0.2f)
                            .fillMaxSize()
                    ) {
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(1))
                            }
                        ) {
                            Text("1")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(2))
                            }
                        ) {
                            Text("2")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(3))
                            }
                        ) {
                            Text("3")
                        }
                        Button(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Op(Operator.PLUS))
                            }
                        ) {
                            Text("+")
                        }
                    }
                    Row(
                        modifier = Modifier
                            .weight(0.2f)
                            .fillMaxSize()
                    ) {
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Number(0))
                            }
                        ) {
                            Text("0")
                        }
                        OutlinedButton(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Point("."))
                            }
                        ) {
                            Text(".")
                        }
                        Button(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Back)
                            }
                        ) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "A delete icon")
                        }
                        Button(
                            modifier = Modifier
                                .padding(4.dp)
                                .weight(0.25f)
                                .fillMaxSize(),
                            onClick = {
                                vm.emit(Input.Evaluate("="))
                            }
                        ) {
                            Text("=")
                        }
                    }
                }
            }
        }
    }

}


