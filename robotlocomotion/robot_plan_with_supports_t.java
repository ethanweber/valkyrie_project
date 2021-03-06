/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package robotlocomotion;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class robot_plan_with_supports_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public robotlocomotion.robot_plan_t plan;
    public robotlocomotion.support_sequence_t support_sequence;
    public boolean is_quasistatic;
 
    public robot_plan_with_supports_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xa0a81c58290536e2L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(robotlocomotion.robot_plan_with_supports_t.class))
            return 0L;
 
        classes.add(robotlocomotion.robot_plan_with_supports_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + robotlocomotion.robot_plan_t._hashRecursive(classes)
             + robotlocomotion.support_sequence_t._hashRecursive(classes)
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
 
        this.plan._encodeRecursive(outs); 
 
        this.support_sequence._encodeRecursive(outs); 
 
        outs.writeByte( this.is_quasistatic ? 1 : 0); 
 
    }
 
    public robot_plan_with_supports_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public robot_plan_with_supports_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static robotlocomotion.robot_plan_with_supports_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        robotlocomotion.robot_plan_with_supports_t o = new robotlocomotion.robot_plan_with_supports_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.plan = robotlocomotion.robot_plan_t._decodeRecursiveFactory(ins);
 
        this.support_sequence = robotlocomotion.support_sequence_t._decodeRecursiveFactory(ins);
 
        this.is_quasistatic = ins.readByte()!=0;
 
    }
 
    public robotlocomotion.robot_plan_with_supports_t copy()
    {
        robotlocomotion.robot_plan_with_supports_t outobj = new robotlocomotion.robot_plan_with_supports_t();
        outobj.utime = this.utime;
 
        outobj.plan = this.plan.copy();
 
        outobj.support_sequence = this.support_sequence.copy();
 
        outobj.is_quasistatic = this.is_quasistatic;
 
        return outobj;
    }
 
}

