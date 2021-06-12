package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;


public class Controller {
    //Initialize variable
    double input1;
    JOptionPane msg;

    @FXML
    private TextField txt1;

    @FXML
    private Button btnMeter;

    @FXML
    private Button btnKiloMeter;

    @FXML
    private Button btnTempC;

    @FXML
    private Button btnTempF;

    @FXML
    private Button btnInr;

    @FXML
    private Button btnVolume;

    @FXML
    private Button clear;

    @FXML
    private Label lable1;

    @FXML
    void buttonClicked(ActionEvent event) {
        //Convert kilometer to meter
        if(event.getSource() == btnMeter) {
            try {
                input1 = Double.parseDouble(txt1.getText());
                txt1.setText(String.valueOf(input1*1000+"m"));
            } catch (Exception exception){JOptionPane.showMessageDialog(msg,"Please enter a number");
            }
        }
        //kilometer to meter
        else if(event.getSource() == btnKiloMeter){
            try {
                input1 = Double.parseDouble(txt1.getText());
                txt1.setText(String.valueOf(input1/1000+"km"));
            }catch (Exception exception){JOptionPane.showMessageDialog(msg, "Please enter a number");}
        }
        //temperature in celcius
        else if(event.getSource() == btnTempC){
            try{
                input1 = Double.parseDouble(txt1.getText());
                double newtemp = ((input1-32)*5)/9;
                txt1.setText(String.valueOf(newtemp)+"C\u00b0");
            }catch (Exception exception){JOptionPane.showMessageDialog(msg, "Please enter a number");}
        }
        //temperature in farenhite
        else if(event.getSource() == btnTempF){
           try{
               input1 = Double.parseDouble(txt1.getText());
               double newtempC = (((input1)*9)/5)+32;
               txt1.setText(String.valueOf(newtempC)+"F\u00b0");
           }catch (Exception exception){JOptionPane.showMessageDialog(msg, "Please enter a number");}
        }
        //volume
        else if(event.getSource() == btnVolume){
           try{
               input1 = Double.parseDouble(txt1.getText());
               double volumeCaluculate = input1*input1*input1;
               txt1.setText(String.valueOf(volumeCaluculate+ "m\u00b3"));
           }catch (Exception exception){JOptionPane.showMessageDialog(msg, "Please enter a number");}
        }
        //convert LKR in to INR
        else if(event.getSource() == btnInr){
            try {
                input1 = Double.parseDouble(txt1.getText());
                double newtINR= input1/2.71 ;
                txt1.setText(String.valueOf(newtINR +"INR"));
            }catch (Exception exception){JOptionPane.showMessageDialog(msg, "Please enter a number");}
        }
        //Clear button
        else if (event.getSource() == clear){
            txt1.setText("");
        }
    }
}
