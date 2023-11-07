from flask import Flask, render_template, request, jsonify

app = Flask(__name__)


@app.route('/')
def index():
    return render_template('test.html')
# render_template('test.html')


host_addr = "192.168.0.8"
port_num = "8000"

if __name__ == '__main__':
    app.run(host=host_addr, port=port_num, debug=True)
