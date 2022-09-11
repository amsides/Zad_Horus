package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Wall implements Structure {
    private List<Block> blocks;

    public List getBlocks() {
        return blocks;
    }

    public void setBlocks(List blocks) {
        this.blocks = blocks;
    }

    public Wall(List blocks) {
        this.blocks = blocks;
    }

    public Wall() {
    }



    @Override
    public Optional<Block> findBlockByColor(String color) {
       Block block=null;

        for (Block bb:blocks) {
            if(bb.getColor().equals(color)){
                block=bb;
            }
        }

        return Optional.ofNullable(block);
    }

    @Override
    public List findBlocksByMaterial(String material)  {

       List blocksmaterial=null;

       for (Block bb:blocks) {
            if(bb.getMaterial().equals(material)){
                blocksmaterial.add(bb);
            }
        }


        return blocksmaterial;
    }




    @Override
    public int count() {
        return blocks.size();
    }



}
