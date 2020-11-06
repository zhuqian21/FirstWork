package TestWork;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int maxPoints(Point[] points) {
		if (points == null) {
			return 0;
		}
		if (points.length < 3) {
			return points.length;
		}
		int i, j;
		double k;
		int res = 0;
		for (i = 0; i < points.length; i++) {
			int same = 0;
			int ver = 1;
			int num = 1;
			Map<Double, Integer> hash = new HashMap<Double, Integer>();
			for (j = i + 1; j < points.length; j++) {
				if (points[i].x == points[j].x && points[i].y == points[j].y) {
					same++;
				} else if (points[i].x == points[j].x
						&& points[i].y != points[j].y) {
					ver++;
					num = Math.max(num, ver);
				} else {
					double dy = points[j].y - points[i].y;
					double dx = points[j].x - points[i].x;
					k = dy / dx + 0.0;
					if (hash.get(k) == null) {
						hash.put(k, 2);
					} else {
						hash.put(k, hash.get(k) + 1);
					}
					num = Math.max(num, hash.get(k));
				}
			}
			res = Math.max(res, num + same);
		}
		return res;
	}
}
