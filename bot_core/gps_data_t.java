/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class gps_data_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public int gps_lock;
    public double longitude;
    public double latitude;
    public double elev;
    public double horizontal_accuracy;
    public double vertical_accuracy;
    public int numSatellites;
    public double speed;
    public double heading;
    public double xyz_pos[];
    public double gps_time;
 
    public gps_data_t()
    {
        xyz_pos = new double[3];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x6be9070f34520a8bL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.gps_data_t.class))
            return 0L;
 
        classes.add(bot_core.gps_data_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeLong(this.utime); 
 
        outs.writeInt(this.gps_lock); 
 
        outs.writeDouble(this.longitude); 
 
        outs.writeDouble(this.latitude); 
 
        outs.writeDouble(this.elev); 
 
        outs.writeDouble(this.horizontal_accuracy); 
 
        outs.writeDouble(this.vertical_accuracy); 
 
        outs.writeInt(this.numSatellites); 
 
        outs.writeDouble(this.speed); 
 
        outs.writeDouble(this.heading); 
 
        for (int a = 0; a < 3; a++) {
            outs.writeDouble(this.xyz_pos[a]); 
        }
 
        outs.writeDouble(this.gps_time); 
 
    }
 
    public gps_data_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public gps_data_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.gps_data_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.gps_data_t o = new bot_core.gps_data_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.gps_lock = ins.readInt();
 
        this.longitude = ins.readDouble();
 
        this.latitude = ins.readDouble();
 
        this.elev = ins.readDouble();
 
        this.horizontal_accuracy = ins.readDouble();
 
        this.vertical_accuracy = ins.readDouble();
 
        this.numSatellites = ins.readInt();
 
        this.speed = ins.readDouble();
 
        this.heading = ins.readDouble();
 
        this.xyz_pos = new double[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.xyz_pos[a] = ins.readDouble();
        }
 
        this.gps_time = ins.readDouble();
 
    }
 
    public bot_core.gps_data_t copy()
    {
        bot_core.gps_data_t outobj = new bot_core.gps_data_t();
        outobj.utime = this.utime;
 
        outobj.gps_lock = this.gps_lock;
 
        outobj.longitude = this.longitude;
 
        outobj.latitude = this.latitude;
 
        outobj.elev = this.elev;
 
        outobj.horizontal_accuracy = this.horizontal_accuracy;
 
        outobj.vertical_accuracy = this.vertical_accuracy;
 
        outobj.numSatellites = this.numSatellites;
 
        outobj.speed = this.speed;
 
        outobj.heading = this.heading;
 
        outobj.xyz_pos = new double[(int) 3];
        System.arraycopy(this.xyz_pos, 0, outobj.xyz_pos, 0, 3); 
        outobj.gps_time = this.gps_time;
 
        return outobj;
    }
 
}

