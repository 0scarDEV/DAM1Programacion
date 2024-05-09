package pruebas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo1 extends Application{
        @Override public void start(Stage primaryStage) throws Exception {
            // En la ventana le asignamos el título
            primaryStage.setTitle("Título");
            // Creamos un botón con el texto "Púlsame"
            Button btn1 = new Button("Púlsame");
            // Si queremos que al pulsar pase algo:
            btn1.setOnMouseClicked(null);
            // Creamos una escena que contiene el botón creado.
            Scene scene = new Scene(btn1);
            // Añadimos la escena a la ventana de usuario.
            primaryStage.setScene(scene);
            // Mostramos la ventana con lo anterior.
            primaryStage.show();
        }
        public static void main(String[] args) {

            try (BufferedReader in = new BufferedReader(new FileReader("UD07/0. Pruebas/pruebas/prueba.txt"))) {
                System.out.println(in.read());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}