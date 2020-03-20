package codepath.com.bookse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Book> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        // Lookup the recyclerview in activity layout
        RecyclerView rvBooks = (RecyclerView) findViewById(R.id.rvBooks);

        // Initialize books
        books = Book.createContactsList(30);
        // Create adapter passing in the sample user data
        BooksAdapter adapter = new BooksAdapter(books);
        // Attach the adapter to the recyclerview to populate items
        rvBooks.setAdapter(adapter);
        // Set layout manager to position the items
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        // That's all!

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
