package com.example.a2_procesosenjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.IOException;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HelloController {

    @FXML
    private Button btnCD;

    @FXML
    private Button btnCalculadora;

    @FXML
    private Button btnCHDIR;

    @FXML
    private Button btnRD;

    @FXML
    private Label txtComandos;

    @FXML
    private Label txtGrafica;

    @FXML
    private Label txtTitle;

    @FXML
    private Label welcomeText;

    @FXML
    public void botonDRIVERQUERY(ActionEvent event) {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("cmd", "/C", "DRIVERQUERY", ">", "DRIVERQUERY.txt");
        pb.inheritIO();
        try {
            Process ps = pb.start();
            int exitCode = ps.waitFor();
            System.out.println("ID del Proceso: " + ps.pid());
            System.out.println("El proceso hijo ha terminado con código de salida: " + exitCode);
            ps.destroy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void botonCHDIR(ActionEvent event) {
        ProcessBuilder pb=new ProcessBuilder();
        pb.command("cmd", "/C", "chdir", ">", "chdir.txt");
        pb.inheritIO();
        try {
            Process ps = pb.start();
            int exitCode = ps.waitFor();
            System.out.println("ID del Proceso: " + ps.pid());
            System.out.println("El proceso hijo ha terminado con código de salida: " + exitCode);
            ps.destroy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void botonFSUTIL(ActionEvent event) {
        ProcessBuilder pb=new ProcessBuilder();
        pb.command("cmd", "/C", "FSUTIL", ">", "FSUTIL.txt");
        pb.inheritIO();
        try {
            Process ps = pb.start();
            int exitCode = ps.waitFor();
            System.out.println("ID del Proceso: " + ps.pid());
            System.out.println("El proceso hijo ha terminado con código de salida: " + exitCode);
            ps.destroy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    public void botonCalculadora(ActionEvent event) {
        ProcessBuilder pb=new ProcessBuilder();
        pb.command("cmd", "/C", "calc");
        pb.inheritIO();
        try {
            Process ps = pb.start();
            int exitCode = ps.waitFor();
            System.out.println("ID del Proceso: " + ps.pid());
            System.out.println("El proceso hijo ha terminado con código de salida: " + exitCode);
            ps.destroy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
