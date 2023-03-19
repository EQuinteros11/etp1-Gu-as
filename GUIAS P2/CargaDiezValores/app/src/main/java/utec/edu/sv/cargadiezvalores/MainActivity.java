package utec.edu.sv.cargadiezvalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tvMostrar;
EditText edtNum1,edtNum2,edtNum3,edtNum4,edtNum5,edtNum6,edtNum7,edtNum8,edtNum9,edtNum10;
Button btnMostrar;

int conteoNegativos =0;
int contePositivos=0;

int cantidadmultiplos =0;
int sumapares=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMostrar = findViewById(R.id.tvMostrar);
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        edtNum3 = findViewById(R.id.edtNum3);
        edtNum4 = findViewById(R.id.edtNum4);
        edtNum5 = findViewById(R.id.edtNum5);
        edtNum6 = findViewById(R.id.edtNum6);
        edtNum7 = findViewById(R.id.edtNum7);
        edtNum8 = findViewById(R.id.edtNum8);
        edtNum9 = findViewById(R.id.edtNum9);
        edtNum10 = findViewById(R.id.edtNum10);
        btnMostrar = findViewById(R.id.btnEjecutar);




    }
    public void Ejecutar(View v){
        String num1 = edtNum1.getText().toString();
        String num2 = edtNum2.getText().toString();
        String num3 = edtNum3.getText().toString();
        String num4 = edtNum4.getText().toString();
        String num5 = edtNum5.getText().toString();
        String num6 = edtNum6.getText().toString();
        String num7 = edtNum7.getText().toString();
        String num8 = edtNum8.getText().toString();
        String num9 = edtNum9.getText().toString();
        String num10 = edtNum10.getText().toString();

            if (edtNum1.getText().toString().isEmpty()){
                Toast.makeText(this, "Campos vacio", Toast.LENGTH_SHORT).show();
            } else {
                int uno = Integer.valueOf(num1);
                if (uno  < 0)
                {
                    conteoNegativos =conteoNegativos +1;
                     if ((uno % 15)==0) {
                    cantidadmultiplos = cantidadmultiplos+1;
                        }
                    if (uno % 2 == 0) {
                        sumapares =sumapares+uno;
                    }
                } else if (uno > 0) {
                    contePositivos =contePositivos +1;
                    if ((uno % 15)==0) {
                        cantidadmultiplos = cantidadmultiplos+1;
                    }
                    if (uno % 2 == 0) {
                        sumapares =sumapares+uno;
                    }
                }
            }
            if (edtNum2.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 2 vacio", Toast.LENGTH_SHORT).show();
            } else {
                        int Dos = Integer.valueOf(num2);
                        if (Dos  < 0)
                        {
                            conteoNegativos =conteoNegativos +1;
                            if (Dos % 15==0) {
                                cantidadmultiplos = cantidadmultiplos+1;
                            }
                            if (Dos % 2 == 0) {
                                sumapares =sumapares+Dos;
                            }
                        } else if (Dos > 0) {
                            contePositivos =contePositivos +1;
                            if (Dos % 15==0) {
                                cantidadmultiplos = cantidadmultiplos+1;
                            }
                            if (Dos % 2 == 0) {
                                sumapares =sumapares+Dos;
                            }
                        }
                   }
            if (edtNum3.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 2 vacio", Toast.LENGTH_SHORT).show();
            }else {
                    int Tres = Integer.valueOf(num3);
                    if (Tres  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (Tres % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (Tres % 2 == 0) {
                            sumapares =sumapares+Tres;
                        }
                    } else if (Tres > 0) {
                        contePositivos =contePositivos +1;
                        if (Tres % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (Tres % 2 == 0) {
                            sumapares =sumapares+Tres;
                        }
                    }
                }
            if (edtNum4.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 4 vacio", Toast.LENGTH_SHORT).show();
            } else {
                    int Cuatro = Integer.valueOf(num4);
                    if (Cuatro  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (Cuatro % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (Cuatro % 2 == 0) {
                            sumapares =sumapares+Cuatro;
                        }
                    } else if (Cuatro > 0) {
                        contePositivos =contePositivos +1;
                        if (Cuatro % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (Cuatro % 2 == 0) {
                            sumapares =sumapares+Cuatro;
                        }
                    }
                }

            if (edtNum5.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 5 vacio", Toast.LENGTH_SHORT).show();
            } else {
                    int cinco = Integer.valueOf(num5);
                    if (cinco  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (cinco % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (cinco % 2 == 0) {
                            sumapares =sumapares+cinco;
                        }
                    } else if (cinco > 0) {
                        contePositivos =contePositivos +1;
                        if (cinco % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (cinco % 2 == 0) {
                            sumapares =sumapares+cinco;
                        }
                    }
                }

            if (edtNum6.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 6 vacio", Toast.LENGTH_SHORT).show();

            } else {
                    int seis = Integer.valueOf(num6);
                    if (seis  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (seis % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (seis % 2 == 0) {
                            sumapares =sumapares+seis;
                        }
                    } else if (seis > 0) {
                        contePositivos =contePositivos +1;
                        if (seis % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (seis % 2 == 0) {
                            sumapares =sumapares+seis;
                        }
                    }
                }

            if (edtNum7.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 7 vacio", Toast.LENGTH_SHORT).show();
            } else {
                    int siete = Integer.valueOf(num7);
                    if (siete  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (siete % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (siete % 2 == 0) {
                            sumapares =sumapares+siete;
                        }
                    } else if (siete > 0) {
                        contePositivos =contePositivos +1;
                        if (siete % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (siete % 2 == 0) {
                            sumapares =sumapares+siete;
                        }
                    }
                 }

            if (edtNum8.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 8 vacio", Toast.LENGTH_SHORT).show();
            } else {
                    int ocho = Integer.valueOf(num8);
                    if (ocho  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (ocho % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (ocho % 2 == 0) {
                            sumapares =sumapares+ocho;
                        }
                    } else if (ocho > 0) {
                        contePositivos =contePositivos +1;
                        if (ocho % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (ocho % 2 == 0) {
                            sumapares =sumapares+ocho;
                        }
                    }
                }

            if (edtNum9.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 9 vacio", Toast.LENGTH_SHORT).show();
            } else {
                    int nueve = Integer.valueOf(num9);
                    if (nueve  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (nueve % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (nueve % 2 == 0) {
                            sumapares =sumapares+nueve;
                        }
                    } else if (nueve > 0) {
                        contePositivos =contePositivos +1;
                        if (nueve % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (nueve % 2 == 0) {
                            sumapares =sumapares+nueve;
                        }
                    }
                 }

            if (edtNum10.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo 10 vacio", Toast.LENGTH_SHORT).show();
            }else {
                    int diez = Integer.valueOf(num10);
                    if (diez  < 0)
                    {
                        conteoNegativos =conteoNegativos +1;
                        if (diez % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (diez % 2 == 0) {
                            sumapares =sumapares+diez;
                        }
                    } else if (diez > 0) {
                        contePositivos =contePositivos +1;
                        if (diez % 15==0) {
                            cantidadmultiplos = cantidadmultiplos+1;
                        }
                        if (diez % 2 == 0) {
                            sumapares =sumapares+diez;
                        }
                    }
                }

            tvMostrar.setText("Cantidad de valores negativos:        "+ conteoNegativos+"\n"+
                              "Cantidad de valores positivos:        "+contePositivos+"\n"+
                              "Cantidad de valores multiplos de 15 : "+ cantidadmultiplos+"\n"+
                              "Valor acumulado de números Pares:     "+sumapares);
    }
}
