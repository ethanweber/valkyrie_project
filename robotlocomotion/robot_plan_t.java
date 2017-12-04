/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package robotlocomotion;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class robot_plan_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public String robot_name;
    public int num_states;
    public bot_core.robot_state_t plan[];
    public int plan_info[];
    public int num_grasp_transitions;
    public robotlocomotion.grasp_transition_state_t grasps[];
    public byte left_arm_control_type;
    public byte right_arm_control_type;
    public byte left_leg_control_type;
    public byte right_leg_control_type;
    public int num_bytes;
    public byte matlab_data[];
 
    public robot_plan_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x78a77f5ef28fedeeL;
 
    public static final byte NONE = (byte) 0;
    public static final byte POSITION = (byte) 1;
    public static final byte IMPEDANCE = (byte) 2;
    public static final byte STIFF = (byte) 3;
    public static final byte COMPLIANT = (byte) 4;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(robotlocomotion.robot_plan_t.class))
            return 0L;
 
        classes.add(robotlocomotion.robot_plan_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + bot_core.robot_state_t._hashRecursive(classes)
             + robotlocomotion.grasp_transition_state_t._hashRecursive(classes)
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
 
        outs.writeInt(this.num_states); 
 
        for (int a = 0; a < this.num_states; a++) {
            this.plan[a]._encodeRecursive(outs); 
        }
 
        for (int a = 0; a < this.num_states; a++) {
            outs.writeInt(this.plan_info[a]); 
        }
 
        outs.writeInt(this.num_grasp_transitions); 
 
        for (int a = 0; a < this.num_grasp_transitions; a++) {
            this.grasps[a]._encodeRecursive(outs); 
        }
 
        outs.writeByte(this.left_arm_control_type); 
 
        outs.writeByte(this.right_arm_control_type); 
 
        outs.writeByte(this.left_leg_control_type); 
 
        outs.writeByte(this.right_leg_control_type); 
 
        outs.writeInt(this.num_bytes); 
 
        if (this.num_bytes > 0)
            outs.write(this.matlab_data, 0, num_bytes);
 
    }
 
    public robot_plan_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public robot_plan_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static robotlocomotion.robot_plan_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        robotlocomotion.robot_plan_t o = new robotlocomotion.robot_plan_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        char[] __strbuf = null;
        this.utime = ins.readLong();
 
        __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.robot_name = new String(__strbuf);
 
        this.num_states = ins.readInt();
 
        this.plan = new bot_core.robot_state_t[(int) num_states];
        for (int a = 0; a < this.num_states; a++) {
            this.plan[a] = bot_core.robot_state_t._decodeRecursiveFactory(ins);
        }
 
        this.plan_info = new int[(int) num_states];
        for (int a = 0; a < this.num_states; a++) {
            this.plan_info[a] = ins.readInt();
        }
 
        this.num_grasp_transitions = ins.readInt();
 
        this.grasps = new robotlocomotion.grasp_transition_state_t[(int) num_grasp_transitions];
        for (int a = 0; a < this.num_grasp_transitions; a++) {
            this.grasps[a] = robotlocomotion.grasp_transition_state_t._decodeRecursiveFactory(ins);
        }
 
        this.left_arm_control_type = ins.readByte();
 
        this.right_arm_control_type = ins.readByte();
 
        this.left_leg_control_type = ins.readByte();
 
        this.right_leg_control_type = ins.readByte();
 
        this.num_bytes = ins.readInt();
 
        this.matlab_data = new byte[(int) num_bytes];
        ins.readFully(this.matlab_data, 0, num_bytes); 
    }
 
    public robotlocomotion.robot_plan_t copy()
    {
        robotlocomotion.robot_plan_t outobj = new robotlocomotion.robot_plan_t();
        outobj.utime = this.utime;
 
        outobj.robot_name = this.robot_name;
 
        outobj.num_states = this.num_states;
 
        outobj.plan = new bot_core.robot_state_t[(int) num_states];
        for (int a = 0; a < this.num_states; a++) {
            outobj.plan[a] = this.plan[a].copy();
        }
 
        outobj.plan_info = new int[(int) num_states];
        if (this.num_states > 0)
            System.arraycopy(this.plan_info, 0, outobj.plan_info, 0, this.num_states); 
        outobj.num_grasp_transitions = this.num_grasp_transitions;
 
        outobj.grasps = new robotlocomotion.grasp_transition_state_t[(int) num_grasp_transitions];
        for (int a = 0; a < this.num_grasp_transitions; a++) {
            outobj.grasps[a] = this.grasps[a].copy();
        }
 
        outobj.left_arm_control_type = this.left_arm_control_type;
 
        outobj.right_arm_control_type = this.right_arm_control_type;
 
        outobj.left_leg_control_type = this.left_leg_control_type;
 
        outobj.right_leg_control_type = this.right_leg_control_type;
 
        outobj.num_bytes = this.num_bytes;
 
        outobj.matlab_data = new byte[(int) num_bytes];
        if (this.num_bytes > 0)
            System.arraycopy(this.matlab_data, 0, outobj.matlab_data, 0, this.num_bytes); 
        return outobj;
    }
 
}

