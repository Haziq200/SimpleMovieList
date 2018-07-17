package sg.edu.rp.dmsd.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Step 1b: Create a Listview variable
    ListView lvMovie;

    //Step 2a: Create an ArrayList variable
    ArrayList<String> alMovieList;

    //Step 3a: Create an ArrayAdapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        //Step 1c: Bind the UI element to the Java variable
        lvMovie  =findViewById(R.id.listViewMovie);

        //step 2b: Initialise the Arraylist
        alMovieList = new ArrayList<>();

        //step 2c: Add data into the ArrayList
        alMovieList.add("Avengers Infinity War Release Date: 2018.04");
        alMovieList.add("Justice League Release Date: 2017.11");

        //Step 3b: initialise the Array Adapter and bind it into the Array List
        aaMovie = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alMovieList);

        //step 4: bind the listview to the array adapter
        lvMovie.setAdapter(aaMovie);
    }
}
