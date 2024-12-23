package org.mrebrahimi.utility.printer.decorator.concrete;

import org.mrebrahimi.utility.printer.decorator.Printer;

import static org.mrebrahimi.utility.printer.util.Constants.GREEN;

public class SuccessPrinter extends ColorFulPrinter {
    public SuccessPrinter(Printer printer) {
        super(printer);
    }

    @Override
    String getColor() {
        return GREEN;
    }
}
