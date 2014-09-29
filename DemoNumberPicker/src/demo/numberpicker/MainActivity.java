package demo.numberpicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.NumberPicker;
import android.widget.Toast;
import android.widget.NumberPicker.OnValueChangeListener;

/**
 * Demo of Android's Number Picker view.
 *
 * Tasks:
 * 1) Perform a *thorough* code inspection.
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 * @version 1.0 Initial project with a single NumberPicker; no event handler
 *
 */
public class MainActivity extends Activity implements OnValueChangeListener {
	
	// INSTANCE VARIABLE:
	private NumberPicker np;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// reference the numberpicker in activy_main.xml
		np = (NumberPicker) findViewById( R.id.numberPicker1 );
		
		// set the range of legal values (i.e. domain validation)
		np.setMaxValue( 255 );
		np.setMinValue( 0 );
		np.setValue( 5 );
		
		// register this activity as the event handler for the numberpicker
		np.setOnValueChangedListener( this );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onValueChange(NumberPicker theNumberPicker, int oldVal, int newVal) {
		//System.out.println( "Old: " + oldVal + "\tNew: " + newVal );
		Toast.makeText(getApplicationContext()
				, "Old: " + oldVal + "\tNew: " + newVal
				, Toast.LENGTH_SHORT).show();
		
	}
}
