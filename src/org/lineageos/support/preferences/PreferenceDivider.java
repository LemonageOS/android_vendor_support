/*
 * Copyright (C) 2020 Wave-OS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lineageos.support.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import org.lineageos.support.R;

public class PreferenceDivider extends Preference {

    private LayoutInflater inflater;

    private Context mContext;

    public PreferenceDivider(Context context) {
        super(context);
        initViews(context);
    }

    public PreferenceDivider(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews(context);
    }

    public PreferenceDivider(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initViews(context);
    }

    private void initViews(Context context) {
        mContext = context;
        setLayoutResource(R.layout.preference_divider);
        setEnabled(false);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        holder.setDividerAllowedBelow(false);
        holder.setDividerAllowedAbove(false);
    }
}
