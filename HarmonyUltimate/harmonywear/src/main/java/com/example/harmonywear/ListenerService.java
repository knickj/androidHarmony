package com.example.harmonywear;

import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by Nick on 3/24/2015.
 */
public class ListenerService extends WearableListenerService {

    private static final String WEARABLE_DATA_PATH = "/message_path";

    @Override
    public void onDataChanged(DataEventBuffer dataEvents) {

        DataMap dataMap;
        for (DataEvent event : dataEvents) {

            // Check the data type
            if (event.getType() == DataEvent.TYPE_CHANGED) {
                // Check the data path
                String path = event.getDataItem().getUri().getPath();
                if (path.equals(WEARABLE_DATA_PATH)) {
                    dataMap = DataMapItem.fromDataItem(event.getDataItem()).getDataMap();
                    Log.v("myTag", "Connected: " + dataMap);
                }
                else if (path.equals("/activities")) {
                    dataMap = DataMapItem.fromDataItem(event.getDataItem()).getDataMap();
                    Log.v("myTag", "Connected: " + dataMap);
                }
                dataMap = DataMapItem.fromDataItem(event.getDataItem()).getDataMap();
                Log.v("myTag", "DataMap received on watch: " + dataMap);

            }
        }
    }
}