/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Theophile
 */
public class OptionSet implements Serializable{
    private String optionSetName;
    private Option option[];

    public OptionSet() {
    }

    public OptionSet(String optionSetName, Option[] option) {
        this.optionSetName = optionSetName;
        this.option = option;
    }

    public String getOptionSetName() {
        return optionSetName;
    }

    public void setOptionSetName(String optionSetName) {
        this.optionSetName = optionSetName;
    }

    public Option[] getOption() {
        return option;
    }

    public void setOption(Option[] option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "OptionSet{" + "optionSetName=" + optionSetName + ", option=" + option + '}';
    }
    
    
}
