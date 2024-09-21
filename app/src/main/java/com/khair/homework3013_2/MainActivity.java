package com.khair.homework3013_2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.tvDisplay);

        Employee employee1=new Employee("Abul khair",50000, LocalDate.of(2015, 6, 15));
        tvDisplay.append("\n Name :"+employee1.getName());
        tvDisplay.append("\n Salary :"+employee1.getSalary());
        tvDisplay.append("\n HireDate :"+employee1.getHireDate());
        tvDisplay.append("\n Years of Service: :"+employee1.calculateYearsOfService());




    }
}