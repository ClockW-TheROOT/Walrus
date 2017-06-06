package com.bugfuzz.android.projectwalrus.device;

import org.parceler.Parcel;

@Parcel
public final class CardData {
    public enum Type {
        HID,
        MIFARE
    }

    public Type type;
    public String data;

    public CardData() {
    }

    public CardData(Type type, String data) {
        this.type = type;
        this.data = data;
    }
}