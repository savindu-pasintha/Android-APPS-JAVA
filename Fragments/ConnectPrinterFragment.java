package com.example.printerui;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
import rx.subscriptions.CompositeSubscription;
import toolkit.Constants;
import toolkit.bp1.ConnectedState;
import toolkit.printers.connect.BluetoothDiscover;
import toolkit.printers.connect.ConnectionBluetooth;
import toolkit.printers.connect.ConnectionUsb;
import toolkit.printers.periphery.abstraction.Printer;
import toolkit.printers.periphery.impl.EscPosUtils_impl;
import toolkit.printers.periphery.impl.PrinterAlphaNumericEscPos;


 */
/*
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.c;
import android.support.v7.widget.Toolbar;
 */

/* compiled from: ConnectPrinterFragment.java */
/* loaded from: classes.dex */
public class ConnectPrinterFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_connect_printer, container, false);
        Log.d("Tag", "onCreateView: started.");
        return view;
    }
}
