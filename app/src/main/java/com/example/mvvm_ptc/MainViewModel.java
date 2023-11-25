package com.example.mvvm_ptc;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_ptc.CalcularModel;
public class MainViewModel extends ViewModel {
    private CalcularModel model = new CalcularModel();
    public int suma(int num1, int num2){
        return model.suma(num1, num2);
    }
}
