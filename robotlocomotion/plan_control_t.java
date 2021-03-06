/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package robotlocomotion;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class plan_control_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public short control;
 
    public plan_control_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xea36ce2aa3db0564L;
 
    public static final short PAUSE = (short) 0;
    public static final short UNPAUSE = (short) 1;
    public static final short TERMINATE = (short) 2;
    public static final short REVERT = (short) 3;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(robotlocomotion.plan_control_t.class))
            return 0L;
 
        classes.add(robotlocomotion.plan_control_t.class);
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
 
        outs.writeShort(this.control); 
 
    }
 
    public plan_control_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public plan_control_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static robotlocomotion.plan_control_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        robotlocomotion.plan_control_t o = new robotlocomotion.plan_control_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.control = ins.readShort();
 
    }
 
    public robotlocomotion.plan_control_t copy()
    {
        robotlocomotion.plan_control_t outobj = new robotlocomotion.plan_control_t();
        outobj.utime = this.utime;
 
        outobj.control = this.control;
 
        return outobj;
    }
 
}

