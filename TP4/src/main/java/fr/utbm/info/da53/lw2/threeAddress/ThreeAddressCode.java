package fr.utbm.info.da53.lw2.threeAddress;

import fr.utbm.info.da53.lw2.symbol.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The ThreeAddressCode class manages a list of ThreeAddressRecord objects
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class ThreeAddressCode {

    private List<ThreeAddressRecord> records;

    private Map<Integer, Integer> lineMapping;

    private SymbolTable symbolTable;

    private int tempVarCounter;

    private int labelCounter;

    /**
     * Constructor
     *
     * @param symbolTable is the symbol table
     */
    public ThreeAddressCode(SymbolTable symbolTable) {
        this.records = new ArrayList<>();
        this.lineMapping = new HashMap<>();
        this.symbolTable = symbolTable;
        this.tempVarCounter = 0;
        this.labelCounter = 0;
    }

    /**
     * Create a new temporary variable
     *
     * @return the name of the temporary variable
     */
    public String createTempVariable() {
        String tempVar = "t" + tempVarCounter++;
        symbolTable.declare(tempVar, -1); // Declare in symbol table with no specific line
        return tempVar;
    }

    /**
     * Create a new label
     *
     * @return the name of the temporary variable
     */
    public String createLabel() {
        return "L" + labelCounter++;
    }

    /**
     * Add a new Three Address Code record
     *
     * @param record is the record to add
     */
    public void addRecord(ThreeAddressRecord record) {
        records.add(record);
    }

    /**
     * Map TinyBasic line to Three Address Code line
     *
     * @param tinyBasicLine is the TinyBasic line
     * @param tacLine is the Three Address Code line
     */
    public void mapLine(int tinyBasicLine, int tacLine) {
        lineMapping.put(tinyBasicLine, tacLine);
    }

    /**
     * Get all Three Address Code records
     *
     * @return the list of records
     */
    public List<ThreeAddressRecord> getRecords() {
        return records;
    }

}
