package com.vapp.imess.ui;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.google.android.mms.pdu_alt.PduHeaders;
import com.moez.QKSMS.common.DonationManager;
import com.moez.QKSMS.common.LiveViewManager;
import com.moez.QKSMS.common.QKRateSnack;
import com.moez.QKSMS.common.google.DraftCache;
import com.moez.QKSMS.common.utils.MessageUtils;
import com.moez.QKSMS.data.Conversation;
import com.moez.QKSMS.enums.QKPreference;
import com.moez.QKSMS.receiver.IconColorReceiver;
import com.moez.QKSMS.service.DeleteOldMessagesService;
import com.moez.QKSMS.transaction.NotificationManager;
import com.moez.QKSMS.transaction.SmsHelper;
import com.moez.QKSMS.ui.ThemeManager;
import com.moez.QKSMS.ui.base.QKActivity;
import com.moez.QKSMS.ui.conversationlist.ConversationListFragment;
import com.moez.QKSMS.ui.dialog.DefaultSmsHelper;
import com.moez.QKSMS.ui.dialog.QKDialog;
import com.moez.QKSMS.ui.dialog.mms.MMSSetupFragment;
import com.moez.QKSMS.ui.messagelist.MessageListActivity;
import com.moez.QKSMS.ui.search.SearchActivity;
import com.moez.QKSMS.ui.settings.SettingsFragment;
import com.moez.QKSMS.ui.welcome.WelcomeActivity;
import com.vapp.imess.R;

import org.ligi.snackengage.SnackEngage;
import org.ligi.snackengage.snacks.BaseSnack;

import java.util.Collection;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends com.moez.QKSMS.ui.MainActivity {

}
