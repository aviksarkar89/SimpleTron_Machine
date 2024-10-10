/**
 * The class defined serves as the memory for the Simpletron, where the user defines
 the mem size parameters and int array etc. 
 * @author Avik Sarkar
 * @version 3.0
 */

package com.cisc.simpletron.memory;

public class SimpletronMemory {
    private final int[] memory;
    private final int size;

    public SimpletronMemory(int size) {
        this.size = size;
        memory = new int[size];
    }

    public void saveVal(int address, int value) {
        memory[address] = value;
    }

    public int getVal(int address) {
        return memory[address];
    }

    public int getSize() {
        return size;
    }
}
