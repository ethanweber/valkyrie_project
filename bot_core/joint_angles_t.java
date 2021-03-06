/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class joint_angles_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public String robot_name;
    public int num_joints;
    public String joint_name[];
    public double joint_position[];
 
    public joint_angles_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x1f3e6983dc7cf3c8L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.joint_angles_t.class))
            return 0L;
 
        classes.add(bot_core.joint_angles_t.class);
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
        char[] __strbuf = null;
        outs.writeLong(this.utime); 
 
        __strbuf = new char[this.robot_name.length()]; this.robot_name.getChars(0, this.robot_name.length(), __strbuf, 0); outs.writeInt(__strbuf.length+1); for (int _i = 0; _i < __strbuf.length; _i++) outs.write(__strbuf[_i]); outs.writeByte(0); 
 
        outs.writeInt(this.num_joints); 
 
        for (int a = 0; a < this.num_joints; a++) {
            __strbuf = new char[this.joint_name[a].length()]; this.joint_name[a].getChars(0, this.joint_name[a].length(), __strbuf, 0); outs.writeInt(__strbuf.length+1); for (int _i = 0; _i < __strbuf.length; _i++) outs.write(__strbuf[_i]); outs.writeByte(0); 
        }
 
        for (int a = 0; a < this.num_joints; a++) {
            outs.writeDouble(this.joint_position[a]); 
        }
 
    }
 
    public joint_angles_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public joint_angles_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.joint_angles_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.joint_angles_t o = new bot_core.joint_angles_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        char[] __strbuf = null;
        this.utime = ins.readLong();
 
        __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.robot_name = new String(__strbuf);
 
        this.num_joints = ins.readInt();
 
        this.joint_name = new String[(int) num_joints];
        for (int a = 0; a < this.num_joints; a++) {
            __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.joint_name[a] = new String(__strbuf);
        }
 
        this.joint_position = new double[(int) num_joints];
        for (int a = 0; a < this.num_joints; a++) {
            this.joint_position[a] = ins.readDouble();
        }
 
    }
 
    public bot_core.joint_angles_t copy()
    {
        bot_core.joint_angles_t outobj = new bot_core.joint_angles_t();
        outobj.utime = this.utime;
 
        outobj.robot_name = this.robot_name;
 
        outobj.num_joints = this.num_joints;
 
        outobj.joint_name = new String[(int) num_joints];
        if (this.num_joints > 0)
            System.arraycopy(this.joint_name, 0, outobj.joint_name, 0, this.num_joints); 
        outobj.joint_position = new double[(int) num_joints];
        if (this.num_joints > 0)
            System.arraycopy(this.joint_position, 0, outobj.joint_position, 0, this.num_joints); 
        return outobj;
    }
 
}

