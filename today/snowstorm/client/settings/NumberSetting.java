package today.snowstorm.client.settings;

import com.google.gson.annotations.SerializedName;
import today.snowstorm.api.settings.Setting;

public class NumberSetting extends Setting {

    @SerializedName(value = "minimum")
    public double minimum;

    @SerializedName(value = "maximum")
    public double maximum;

    @SerializedName(value = "increment")
    public double increment;

    @SerializedName(value = "value")
    public double value;

    public NumberSetting(String name, double value, double min, double max, double increment) {
        super(name);
        this.value = value;
        this.minimum = min;
        this.maximum = max;
        this.increment = increment;
    }

    public double getValueAsDouble() {
        return value;
    }

    public float getValueAsFloat() {
        return (float) value;
    }

    public int getValueAsInt() {
        return (int) value;
    }

    public long getValueAsLong() {
        return (long) value;
    }

    public void setValue(double value) {
        double precision = 1/increment;
        this.value = Math.round(Math.max(minimum,Math.min(maximum, value)) * precision) / precision;

        //SettingChangeEvent settingNumber = new SettingChangeEvent(getSetting());
        //ModuleManager.onSettingChange(settingNumber);

    }

    public void increment(Boolean positive) {

        setValue(getValueAsDouble() + ((positive ? 1 : -1) * increment));

        //SettingChangeEvent settingNumber = new SettingChangeEvent(getSetting());
        //ModuleManager.onSettingChange(settingNumber);

    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    @Override
    public Object getValueObject() {
        return value;
    }
}
