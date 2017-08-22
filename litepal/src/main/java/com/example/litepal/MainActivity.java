package com.example.litepal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView DataShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataShow = (TextView) findViewById(R.id.DataShow);

        Button createDatabase = (Button) findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Connector.getDatabase();
            }
        });

        Button addData = (Button) findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setName("The Da Vinci Code");
                book.setAuthor("Dan Brown");
                book.setPages(454);
                book.setPrice(25.34);
                book.setPress("China");
                book.save();

            }
        });
        Button upData = (Button) findViewById(R.id.up_data);
        upData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setPrice(19.99);
                book.setPress("USA");
                book.updateAll("name = ? and author = ?","The Da Vinci Code","Dan Brown");
            }
        });
        Button deleteData = (Button) findViewById(R.id.delete_data);
        deleteData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSupport.deleteAll(Book.class,"price>?","15");
            }
        });
        Button query = (Button) findViewById(R.id.query_data);
        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Book> books = DataSupport.findAll(Book.class);
                for(Book book:books){
                    DataShow.setText("book name is "+ book.getName()+"\n"
                        +"book author is: " + book.getAuthor()+"\n"
                        +"book pages is: " + book.getPages()+"\n"
                        +"book price is: " + book.getPrice()+"\n"
                        +"book press is: " + book.getPress());
                }
            }
        });
    }

}
