import sys
sys.path.append('/usr/local/lib/python2.7/site-packages')
import lcm
import time
import json

from robotlocomotion import viewer2_comms_t

lc = lcm.LCM()

msg = viewer2_comms_t()

msg.format = "treeviewer_json"
msg.format_version_major = 1
msg.format_version_minor = 0
data_payload = json.dumps({
        "timestamp": 1486691399249288,
        "setgeometry": [
                {
                        "path": ["robot1", "link1"],
                        "geometry": {
                                "type": "box",
                                "color": [1, 0, 0, 0.5],
                                "lengths": [1, 0.5, 2]
                        }
                }
        ],
        "settransform": [],
        "delete": []
})
msg.data = data_payload
msg.num_bytes = len(data_payload)

# lc.publish("DIRECTOR_TREE_VIEWER_REQUEST_<1>", msg.encode())

def my_handler(channel, data):
    msg = viewer2_comms_t.decode(data)
    print("Received message on channel \"%s\"" % channel)
    print("   format   = %s" % str(msg.format))
    # print("   position    = %s" % str(msg.position))
    # print("   orientation = %s" % str(msg.orientation))
    # print("   ranges: %s" % str(msg.ranges))
    # print("   name        = '%s'" % msg.name)
    # print("   enabled     = %s" % str(msg.enabled))
    print("")

subscription = lc.subscribe("DIRECTOR_TREE_VIEWER_RESPONSE_<idval>", my_handler)

try:
    while True:
        lc.publish("DIRECTOR_TREE_VIEWER_REQUEST_<idval>", msg.encode())
        lc.handle_timeout(1000)
except KeyboardInterrupt:
    pass

lc.unsubscribe(subscription)
