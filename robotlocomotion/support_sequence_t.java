/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package robotlocomotion;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class support_sequence_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public int num_ts;
    public double ts[];
    public robotlocomotion.support_element_t supports[];
 
    public support_sequence_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xf184858f59b0b6dfL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(robotlocomotion.support_sequence_t.class))
            return 0L;
 
        classes.add(robotlocomotion.support_sequence_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + robotlocomotion.support_element_t._hashRecursive(classes)
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
 
        outs.writeInt(this.num_ts); 
 
        for (int a = 0; a < this.num_ts; a++) {
            outs.writeDouble(this.ts[a]); 
        }
 
        for (int a = 0; a < this.num_ts; a++) {
            this.supports[a]._encodeRecursive(outs); 
        }
 
    }
 
    public support_sequence_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public support_sequence_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static robotlocomotion.support_sequence_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        robotlocomotion.support_sequence_t o = new robotlocomotion.support_sequence_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.num_ts = ins.readInt();
 
        this.ts = new double[(int) num_ts];
        for (int a = 0; a < this.num_ts; a++) {
            this.ts[a] = ins.readDouble();
        }
 
        this.supports = new robotlocomotion.support_element_t[(int) num_ts];
        for (int a = 0; a < this.num_ts; a++) {
            this.supports[a] = robotlocomotion.support_element_t._decodeRecursiveFactory(ins);
        }
 
    }
 
    public robotlocomotion.support_sequence_t copy()
    {
        robotlocomotion.support_sequence_t outobj = new robotlocomotion.support_sequence_t();
        outobj.utime = this.utime;
 
        outobj.num_ts = this.num_ts;
 
        outobj.ts = new double[(int) num_ts];
        if (this.num_ts > 0)
            System.arraycopy(this.ts, 0, outobj.ts, 0, this.num_ts); 
        outobj.supports = new robotlocomotion.support_element_t[(int) num_ts];
        for (int a = 0; a < this.num_ts; a++) {
            outobj.supports[a] = this.supports[a].copy();
        }
 
        return outobj;
    }
 
}

