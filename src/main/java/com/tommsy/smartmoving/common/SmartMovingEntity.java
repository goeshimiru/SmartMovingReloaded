/*
* Smart Moving Reloaded
* Copyright (C) 2018  Tommsy64
*
* Smart Moving Reloaded is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Smart Moving Reloaded is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Smart Moving Reloaded.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tommsy.smartmoving.common;

import java.util.List;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public interface SmartMovingEntity {
    public AxisAlignedBB getEntityBoundingBox();

    public double getPosX();

    public double getPosY();

    public double getPosZ();

    public double getPrevPosX();

    public double getPrevPosY();

    public double getPrevPosZ();

    public double getDeltaX();

    public double getDeltaY();

    public double getDeltaZ();

    public World getWorld();

    public float getWidth();

    public float getHeight();

    public void setHeight(float height);

    public int getDimension();

    public List<AxisAlignedBB> getIntersectingCollisionBoxes(AxisAlignedBB aabb);
}
