package com.ragdroid.rxify.home;

import android.content.Intent;
import android.os.Bundle;

import com.ragdroid.rxify.BaseActivity;
import com.ragdroid.rxify.R;
import com.ragdroid.rxify.codelab.ChillActivity;
import com.ragdroid.rxify.codelab.list.CodeLabListActivity;
import com.ragdroid.rxify.dagger.ActivityComponent;
import com.ragdroid.rxify.library.LibraryActivity;
import com.ragdroid.rxify.zip.ZipActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity<HomeContract.Presenter> implements HomeContract.View {

	@Override
	protected int getLayoutId() {
		return R.layout.activity_home;
	}

	@Override
	protected void injectFrom(ActivityComponent activityComponent) {
		activityComponent.inject(this);
	}

	@Override
	protected void setupActivity(Bundle savedInstanceState) {
		ButterKnife.bind(this);
	}

	@OnClick(R.id.rxify_zipyosa)
	void onZipyosaClicked() {
		Intent intent = new Intent(this, ZipActivity.class);
		startActivity(intent);
	}

	@OnClick(R.id.rxify_library)
	void onLibraryClicked() {
		Intent intent = new Intent(this, LibraryActivity.class);
		startActivity(intent);
	}

	@OnClick(R.id.rxify_cl)
	void onClClicked() {
		Intent intent = new Intent(this, CodeLabListActivity.class);
		startActivity(intent);
	}

}
