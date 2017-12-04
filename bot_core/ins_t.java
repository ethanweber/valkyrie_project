/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class ins_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public long device_time;
    public double gyro[];
    public double mag[];
    public double accel[];
    public double quat[];
    public double pressure;
    public double rel_alt;
 
    public ins_t()
    {
        gyro = new double[3];
        mag = new double[3];
        accel = new double[3];
        quat = new double[4];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x4453efb0a1158420L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.ins_t.class))
            return 0L;
 
        classes.add(bot_core.ins_t.class);
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
 
        outs.writeLong(this.device_time); 
 
        for (int a = 0; a < 3; a++) {
            outs.writeDouble(this.gyro[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeDouble(this.mag[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeDouble(this.accel[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.quat[a]); 
        }
 
        outs.writeDouble(this.pressure); 
 
        outs.writeDouble(this.rel_alt); 
 
    }
 
    public ins_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public ins_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.ins_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.ins_t o = new bot_core.ins_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.device_time = ins.readLong();
 
        this.gyro = new double[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.gyro[a] = ins.readDouble();
        }
 
        this.mag = new double[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.mag[a] = ins.readDouble();
        }
 
        this.accel = new double[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.accel[a] = ins.readDouble();
        }
 
        this.quat = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.quat[a] = ins.readDouble();
        }
 
        this.pressure = ins.readDouble();
 
        this.rel_alt = ins.readDouble();
 
    }
 
    public bot_core.ins_t copy()
    {
        bot_core.ins_t outobj = new bot_core.ins_t();
        outobj.utime = this.utime;
 
        outobj.device_time = this.device_time;
 
        outobj.gyro = new double[(int) 3];
        System.arraycopy(this.gyro, 0, outobj.gyro, 0, 3); 
        outobj.mag = new double[(int) 3];
        System.arraycopy(this.mag, 0, outobj.mag, 0, 3); 
        outobj.accel = new double[(int) 3];
        System.arraycopy(this.accel, 0, outobj.accel, 0, 3); 
        outobj.quat = new double[(int) 4];
        System.arraycopy(this.quat, 0, outobj.quat, 0, 4); 
        outobj.pressure = this.pressure;
 
        outobj.rel_alt = this.rel_alt;
 
        return outobj;
    }
 
}
