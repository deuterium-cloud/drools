package cloud.deuterium.drool.model;

/**
 * Created by Milan Stojkovic 26-Apr-2022
 */
public enum CustomerType {

    LOYAL, NEW, DISSATISFIED;

    public String getValue() {
        return this.toString();
    }

}
